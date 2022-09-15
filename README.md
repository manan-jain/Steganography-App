# THE CHAMBERS OF SECRETE

### INTRO TO APP
Image Steganography is widely used for hiding a message image into a cover image. This research domain is deployed at the commercial level at both government and private sector to exhaust its opportunities.This Application encode and decode secret text message and image into and from the cover image. To encode text message and image into cover image, user need to first load cover image into application from their gallary. Then user can write text message in text area to encode/hide it in the cover image. If user want to hide image into cover image then user can add image from gallery into application and by pressing encode button text message and image will be successfully encode into cover image. Remember that only one secret either text message or image can be encoded into cover image at a time. For decoding stego or encoded image will need to be loaded in the application then by pressing decode button encoded secret text message or image will be display to user.

### Algorithm for Encoding:
1. Read a cover image and a text message.
2. Convert cover image into base 64 format.
3. Delete last 4 bits of the base 64 format data of cover image.
4. Calculate number of rest of the bits of base 64 format data of the cover image. Name it Pj
5. Add the text message there at the end of the base 64 format data of image.
6. Write stego image

### Algorithm for Decoding:
1. Read the base 64 format string of stego image.
2. Calculate the number of the bits of base 64 bit format data of stego image.Name it Qj.
3. Subtract Pj from Qj. Name it Msglen.
4. After knowing the Msglen we can easily retrieve the secret message from Qj. Thus we perform the encoding and decoding process in our image steganography application.

## FLOW CHART

[comment]: <> (![here]&#40;https://github.com/lukefire5156/Steganography-App/blob/master/SS/flowchart.png&#41;)
[ flowchart](https://user-images.githubusercontent.com/62428616/190418227-05b44f89-318d-4630-bc5d-546cd7a68a04.png)



<img src="https://user-images.githubusercontent.com/62428616/190418770-78849159-51c3-4706-801d-4fe9f793569e.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190419146-86cb755d-a4eb-4229-ba15-ecc22160a909.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190419591-f2253b98-2115-496e-ba75-cc3905a25ad1.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190419734-5a4d9d11-1ac9-4abf-901b-2cec3c8afbaa.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190419888-f82d86a6-0195-4de7-9d42-27e9edd1f6f4.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190420009-6383e540-a41c-4c4d-8e22-20646bf711b0.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190420151-b283ec16-bc7d-4c4b-a582-0a7dfdaa0497.png" width="250" height="400">

<img src="https://user-images.githubusercontent.com/62428616/190420418-87039cad-7589-4be5-a2d3-87e0e5643580.png" width="250" height="400">

## THANK YOU!!
