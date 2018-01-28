package github.tornaco.xposedmoduletest.ui.activity.whyyouhere;

import android.content.Intent;

import github.tornaco.xposedmoduletest.R;

public class UserGuideActivityB extends UserGuideActivityA {
    @Override
    int getIntroMessage() {
        return R.string.user_notice_title_b;
    }

    @Override
    Intent getNextIntent() {
        return new Intent(this, UserGuideActivityC.class);
    }
}
