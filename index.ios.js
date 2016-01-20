'use strict';
import React, { LinkingIOS } from 'react-native';

var LocationSettings = {
  open: () => {
          LinkingIOS.openURL('app-settings:');
        }
};

export default LocationSettings;
