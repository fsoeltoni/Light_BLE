package org.zpcat.ble.injector.component;

import android.bluetooth.le.BluetoothLeAdvertiser;

import org.zpcat.ble.injector.PerActivity;
import org.zpcat.ble.injector.module.ActivityModule;
import org.zpcat.ble.ui.central.CentralActivity;
import org.zpcat.ble.ui.central.CentralDetailsActivity;
import org.zpcat.ble.ui.main.MainActivity;
import org.zpcat.ble.ui.peripheral.PeripheralActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(CentralActivity activity);
    void inject(CentralDetailsActivity activity);
    void inject(PeripheralActivity activity);

}
