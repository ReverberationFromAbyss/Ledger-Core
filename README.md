# README: Ledger Core
=====================

[TOC]

## Project: Ledger Core

## Background:

For long term suffering of no suitable and easy-to-use
ledger management software for android that is
open source and matches my requirements,
I decide to write one.

So, as we can see, this is totally a individual project and only
aiming to make my own life easier.

The target is an Double-Entry-Bookkeeping software.

## Version

We use SemVer like version convention.

<Break Update>.<Major>.<Minor/Functional Update>.<Patch>-<Short Release Branch Hash>.<Build Time Stamp>[-<Rc#>]

Minor version will increase each time we implement a new function...

Ver:0.0.0.01

## Goal

### Ver. 0.0.01 functions.

For kernel only now...

Ledger Management ... Ledger Entry
1. Title
2. Brief Description
3. Income Asset
4. Expenses Asset
5. Sum of money (Amount)
6. Tags
7. (Auto generated) TimeStamp

Asset Management ... Asset
1. Name
2. Sub-Assets
3. Amount of money (Sum of amounts of sub-assets)
4. Tags

Amount
1. Original Amount of money
2. Value presented by virtual uniformed currency (value of gold per ounce)
3. Currency
4. Functions to modify / convert amount to what based on another currency

Tag Management ... Tag
1. Name
2. Sub-Tags
3. Referencing

## Installation

No installation instruction will be provided until the kernel finished.

## Usage

No Usage and Wiki will be provided until the Android Application is published.

## Relevant

No relevant project.
Of course, there exists different ledger projects like `ledger` a cli ledger manager,
but it doesn't match all my requirements, and I'm not intend to find more...

And I'd like to implement it all with core java language without import third party library.

## Contribute

You may help us by raise issues about function requirement, improvement or any other things.
Or you can create a pull request, we'd merge your branch and add you to contributor list after we review the code.

## License

Apache License ver.2
