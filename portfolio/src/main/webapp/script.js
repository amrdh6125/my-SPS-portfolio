// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random thing to the page.
 */
function addRandomThing() {
  const things =
      ['My favorite sport is basketball.', 
      'My favorite TV show is Attack on Titan.', 
      'My favorite color is red.',
      'My favorite video game is NBA2K12.',
      'My favorite animal is the dolphin.',
      'My favorite TV character is Chandler Bing from Friends.'];

  // Pick a random thing.
  const thing = things[Math.floor(Math.random() * things.length)];

  // Add it to the page.
  const thingContainer = document.getElementById('thing-container');
  thingContainer.innerText = thing;
}
