package org.codeforafrica.citizenreporterandroid.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.codeforafrica.citizenreporterandroid.data.DataManager;
import org.codeforafrica.citizenreporterandroid.ui.assignments.AssignmentFragmentContract;
import org.codeforafrica.citizenreporterandroid.ui.assignments.AssignmentsFragmentPresenter;
import org.codeforafrica.citizenreporterandroid.ui.stories.StoriesFragmentContract;
import org.codeforafrica.citizenreporterandroid.ui.stories.StoriesFragmentPresenter;

/**
 * Created by Ahereza on 9/1/17.
 */

@Module public class PresenterModule {
  @Singleton @Provides AssignmentFragmentContract.Presenter providesAssignmentFragmentPresenter
      (DataManager manager) {
    return new AssignmentsFragmentPresenter(manager);
  }

  @Singleton @Provides StoriesFragmentContract.Presenter providesStoriesFragmentPresenter
      (DataManager manager) {
    return new StoriesFragmentPresenter(manager);
  }
}
