select
 JIGYSYA_CODE,
 TENPO_CODE,
 KAIIN_ID,
 CARDNO,
 CARDYUKOKIGEN_NENGTU,
 CARDKAISYA_CODE,
 KAIIN_STATUS
FROM MST_KAIIN
WHERE
 JIGYSYA_CODE = /*merchantCode*/'00000999'
AND
 KAIIN_ID = /*memberId*/'000001111'