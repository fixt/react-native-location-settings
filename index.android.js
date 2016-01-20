'use strict';
import React, { NativeModules } from 'react-native';
var NativeLocationSettings = NativeModules.LocationSettings;

var LocationSettings = {
  open: NativeLocationSettings.open
};

export default LocationSettings;
