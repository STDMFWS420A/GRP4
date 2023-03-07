import { Selector } from 'testcafe';
import { ClientFunction, c } from 'testcafe';

fixture('Getting Started')
    .page('localhost:8080/login');



test('Login', async t => {
    await t
        .typeText(Selector('#Username'), 'John Smith')
        .typeText(Selector('#Password'), 'test')
        .click(Selector('#Submit'));

    const getLocation = ClientFunction(() => document.location.href);
    await t.expect(getLocation()).contains('/sucess');

});
