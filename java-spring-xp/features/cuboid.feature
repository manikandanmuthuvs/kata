Feature: Cuboid
    As a user
    Iwant to be able to find the volume of cuboid

    @Cuboid
    Scenario Outline: Find the voume of Cuboid
        Given the length "<length>" width "<width>" and height "<height>" of Cuboid
        When user request to get the volume of Cuboid
        Then user gets the volume of Cuboid

        Examples:
        | length | width | height | volume |
        | 2      | 4     | 5      | 40     |