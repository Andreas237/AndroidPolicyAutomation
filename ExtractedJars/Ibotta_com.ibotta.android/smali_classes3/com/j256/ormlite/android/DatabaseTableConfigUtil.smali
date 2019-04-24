.class public Lcom/j256/ormlite/android/DatabaseTableConfigUtil;
.super Ljava/lang/Object;
.source "DatabaseTableConfigUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/android/DatabaseTableConfigUtil$DatabaseFieldSample;
    }
.end annotation


# static fields
.field private static annotationFactoryClazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static annotationMemberClazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final configFieldNums:[I

.field private static elementsField:Ljava/lang/reflect/Field;

.field private static nameField:Ljava/lang/reflect/Field;

.field private static valueField:Ljava/lang/reflect/Field;

.field private static workedC:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    invoke-static {}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->lookupClasses()[I

    move-result-object v0

    sput-object v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I

    return-void
.end method

.method private static assignConfigField(ILcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 0

    packed-switch p0, :pswitch_data_0

    .line 392
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Could not find support for DatabaseField number "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 389
    :pswitch_0
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setReadOnly(Z)V

    goto/16 :goto_0

    .line 386
    :pswitch_1
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignColumnName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 383
    :pswitch_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setVersion(Z)V

    goto/16 :goto_0

    .line 380
    :pswitch_3
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoCreate(Z)V

    goto/16 :goto_0

    .line 377
    :pswitch_4
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnDefinition(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 374
    :pswitch_5
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setAllowGeneratedIdInsert(Z)V

    goto/16 :goto_0

    .line 370
    :pswitch_6
    check-cast p3, Ljava/lang/Class;

    .line 371
    invoke-virtual {p1, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setPersisterClass(Ljava/lang/Class;)V

    goto/16 :goto_0

    .line 366
    :pswitch_7
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setMaxForeignAutoRefreshLevel(I)V

    goto/16 :goto_0

    .line 363
    :pswitch_8
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoRefresh(Z)V

    goto/16 :goto_0

    .line 360
    :pswitch_9
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndexName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 357
    :pswitch_a
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndexName(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 354
    :pswitch_b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndex(Z)V

    goto/16 :goto_0

    .line 351
    :pswitch_c
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndex(Z)V

    goto/16 :goto_0

    .line 348
    :pswitch_d
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueCombo(Z)V

    goto/16 :goto_0

    .line 345
    :pswitch_e
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnique(Z)V

    goto/16 :goto_0

    .line 342
    :pswitch_f
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setFormat(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 339
    :pswitch_10
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setPersisted(Z)V

    goto/16 :goto_0

    .line 336
    :pswitch_11
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setThrowIfNull(Z)V

    goto/16 :goto_0

    .line 333
    :pswitch_12
    check-cast p3, Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findMatchingEnumVal(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnknownEnumValue(Ljava/lang/Enum;)V

    goto :goto_0

    .line 330
    :pswitch_13
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUseGetSet(Z)V

    goto :goto_0

    .line 327
    :pswitch_14
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeign(Z)V

    goto :goto_0

    .line 324
    :pswitch_15
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedIdSequence(Ljava/lang/String;)V

    goto :goto_0

    .line 321
    :pswitch_16
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedId(Z)V

    goto :goto_0

    .line 318
    :pswitch_17
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setId(Z)V

    goto :goto_0

    .line 315
    :pswitch_18
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setCanBeNull(Z)V

    goto :goto_0

    .line 312
    :pswitch_19
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setWidth(I)V

    goto :goto_0

    .line 306
    :pswitch_1a
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_0

    const-string p0, "__ormlite__ no default value string was specified"

    .line 307
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 308
    invoke-virtual {p1, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDefaultValue(Ljava/lang/String;)V

    goto :goto_0

    .line 303
    :pswitch_1b
    check-cast p3, Lcom/j256/ormlite/field/DataType;

    invoke-virtual {p1, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataType(Lcom/j256/ormlite/field/DataType;)V

    goto :goto_0

    .line 300
    :pswitch_1c
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnName(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static buildConfig(Lcom/j256/ormlite/field/DatabaseField;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 273
    invoke-static {p0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p0

    .line 274
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    return-object v1

    .line 278
    :cond_0
    sget-object p1, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;

    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    .line 282
    :cond_1
    new-instance p1, Lcom/j256/ormlite/field/DatabaseFieldConfig;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;-><init>(Ljava/lang/String;)V

    .line 283
    check-cast p0, [Ljava/lang/Object;

    const/4 v0, 0x0

    .line 284
    :goto_0
    sget-object v1, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 285
    sget-object v1, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;

    aget-object v2, p0, v0

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 287
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I

    aget v2, v2, v0

    invoke-static {v2, p1, p2, v1}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->assignConfigField(ILcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method private static configFieldNameToNum(Ljava/lang/String;)I
    .locals 3

    const-string v0, "columnName"

    .line 166
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "dataType"

    .line 168
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "defaultValue"

    .line 170
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "width"

    .line 172
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "canBeNull"

    .line 174
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "id"

    .line 176
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-string v0, "generatedId"

    .line 178
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-string v0, "generatedIdSequence"

    .line 180
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-string v0, "foreign"

    .line 182
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const-string v0, "useGetSet"

    .line 184
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 p0, 0xa

    return p0

    :cond_9
    const-string v0, "unknownEnumName"

    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 p0, 0xb

    return p0

    :cond_a
    const-string v0, "throwIfNull"

    .line 188
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 p0, 0xc

    return p0

    :cond_b
    const-string v0, "persisted"

    .line 190
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 p0, 0xd

    return p0

    :cond_c
    const-string v0, "format"

    .line 192
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 p0, 0xe

    return p0

    :cond_d
    const-string v0, "unique"

    .line 194
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 p0, 0xf

    return p0

    :cond_e
    const-string v0, "uniqueCombo"

    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 p0, 0x10

    return p0

    :cond_f
    const-string v0, "index"

    .line 198
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/16 p0, 0x11

    return p0

    :cond_10
    const-string v0, "uniqueIndex"

    .line 200
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/16 p0, 0x12

    return p0

    :cond_11
    const-string v0, "indexName"

    .line 202
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/16 p0, 0x13

    return p0

    :cond_12
    const-string v0, "uniqueIndexName"

    .line 204
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/16 p0, 0x14

    return p0

    :cond_13
    const-string v0, "foreignAutoRefresh"

    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/16 p0, 0x15

    return p0

    :cond_14
    const-string v0, "maxForeignAutoRefreshLevel"

    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/16 p0, 0x16

    return p0

    :cond_15
    const-string v0, "persisterClass"

    .line 210
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/16 p0, 0x17

    return p0

    :cond_16
    const-string v0, "allowGeneratedIdInsert"

    .line 212
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    const/16 p0, 0x18

    return p0

    :cond_17
    const-string v0, "columnDefinition"

    .line 214
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    const/16 p0, 0x19

    return p0

    :cond_18
    const-string v0, "foreignAutoCreate"

    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/16 p0, 0x1a

    return p0

    :cond_19
    const-string v0, "version"

    .line 218
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/16 p0, 0x1b

    return p0

    :cond_1a
    const-string v0, "foreignColumnName"

    .line 220
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/16 p0, 0x1c

    return p0

    :cond_1b
    const-string v0, "readOnly"

    .line 222
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/16 p0, 0x1d

    return p0

    .line 225
    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find support for DatabaseField "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static configFromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 235
    sget-object v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I

    if-nez v0, :cond_0

    .line 236
    invoke-static {p0, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;

    move-result-object p0

    return-object p0

    .line 243
    :cond_0
    const-class v0, Lcom/j256/ormlite/field/DatabaseField;

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/field/DatabaseField;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 248
    :try_start_0
    invoke-static {v0, p1, p2}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->buildConfig(Lcom/j256/ormlite/field/DatabaseField;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    if-nez v1, :cond_2

    .line 260
    invoke-static {p0, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;

    move-result-object p0

    return-object p0

    .line 262
    :cond_2
    sget p0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I

    add-int/lit8 p0, p0, 0x1

    sput p0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I

    return-object v1
.end method

.method public static fromClass(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/support/ConnectionSource;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/j256/ormlite/table/DatabaseTableConfig<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 45
    invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;

    move-result-object p0

    .line 46
    invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 47
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p1

    :goto_0
    if-eqz v2, :cond_2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 50
    invoke-static {p0, v0, v6}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 51
    invoke-virtual {v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isPersisted()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 52
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-nez p0, :cond_3

    const/4 p0, 0x0

    return-object p0

    .line 59
    :cond_3
    new-instance p0, Lcom/j256/ormlite/table/DatabaseTableConfig;

    invoke-direct {p0, p1, v0, v1}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static lookupClasses()[I
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "org.apache.harmony.lang.annotation.AnnotationFactory"

    .line 77
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;

    const-string v1, "org.apache.harmony.lang.annotation.AnnotationMember"

    .line 78
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;

    const-string v1, "[Lorg.apache.harmony.lang.annotation.AnnotationMember;"

    .line 79
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 86
    :try_start_1
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;

    const-string v3, "elements"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;

    .line 87
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 89
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;

    const-string v4, "name"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;

    .line 90
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 91
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;

    const-string v4, "value"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;

    .line 92
    sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 94
    const-class v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil$DatabaseFieldSample;

    const-string v3, "field"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 101
    const-class v3, Lcom/j256/ormlite/field/DatabaseField;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lcom/j256/ormlite/field/DatabaseField;

    .line 102
    invoke-static {v2}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;

    if-eq v3, v4, :cond_0

    return-object v0

    .line 109
    :cond_0
    :try_start_2
    sget-object v3, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v3, v1, :cond_1

    goto :goto_1

    .line 114
    :cond_1
    check-cast v2, [Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    .line 115
    array-length v1, v2

    new-array v1, v1, [I

    const/4 v3, 0x0

    .line 118
    :goto_0
    array-length v4, v2

    if-ge v3, v4, :cond_2

    .line 119
    sget-object v4, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;

    aget-object v5, v2, v3

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 120
    invoke-static {v4}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNameToNum(Ljava/lang/String;)I

    move-result v4

    aput v4, v1, v3
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    :goto_1
    return-object v0

    :catch_0
    return-object v0

    :catch_1
    return-object v0

    :catch_2
    return-object v0

    :catch_3
    return-object v0
.end method

.method private static valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    .line 397
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
