import { AppClientPage } from './app.po';

describe('app-client App', () => {
  let page: AppClientPage;

  beforeEach(() => {
    page = new AppClientPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
