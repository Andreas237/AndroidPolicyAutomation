.class public abstract Lcom/j256/ormlite/db/BaseDatabaseType;
.super Ljava/lang/Object;
.source "BaseDatabaseType.java"

# interfaces
.implements Lcom/j256/ormlite/db/DatabaseType;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;
    }
.end annotation


# static fields
.field protected static DEFAULT_SEQUENCE_SUFFIX:Ljava/lang/String; = "_id_seq"


# instance fields
.field protected driver:Ljava/sql/Driver;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addSingleUnique(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 503
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, " UNIQUE ("

    .line 504
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string p2, ")"

    .line 506
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private appendCanBeNull(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;)V
    .locals 0

    return-void
.end method

.method private appendDefaultValue(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)V
    .locals 0

    .line 268
    invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isEscapedDefaultValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 269
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto :goto_0

    .line 271
    :cond_0
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method private appendDoubleType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "DOUBLE PRECISION"

    .line 240
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private appendFloatType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "FLOAT"

    .line 233
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private appendIntegerType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "INTEGER"

    .line 219
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public addPrimaryKeySql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 314
    array-length p3, p1

    const/4 p4, 0x0

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p3, :cond_3

    aget-object v0, p1, p5

    .line 315
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->generatedIdSqlAtEnd()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 317
    :cond_0
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isId()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez p4, :cond_1

    .line 319
    new-instance p4, Ljava/lang/StringBuilder;

    const/16 v1, 0x30

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "PRIMARY KEY ("

    .line 320
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v1, 0x2c

    .line 322
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 324
    :goto_1
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p4, v0}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_2
    :goto_2
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_3
    if-eqz p4, :cond_4

    const-string p1, ") "

    .line 328
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public addUniqueComboSql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 344
    array-length p3, p1

    const/4 p4, 0x0

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p3, :cond_2

    aget-object v0, p1, p5

    .line 345
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isUniqueCombo()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p4, :cond_0

    .line 347
    new-instance p4, Ljava/lang/StringBuilder;

    const/16 v1, 0x30

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "UNIQUE ("

    .line 348
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/16 v1, 0x2c

    .line 350
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 352
    :goto_1
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p4, v0}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_2
    if-eqz p4, :cond_3

    const-string p1, ") "

    .line 356
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method protected appendBigDecimalNumericType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "NUMERIC"

    .line 261
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendBooleanType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "BOOLEAN"

    .line 191
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendByteArrayType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "BLOB"

    .line 247
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendByteType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "TINYINT"

    .line 205
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendCharType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "CHAR"

    .line 198
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendColumnArg(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    move-object v8, p0

    move-object v9, p2

    move-object v10, p3

    .line 57
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v11, 0x20

    .line 58
    invoke-virtual {p2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;

    move-result-object v0

    .line 61
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getWidth()I

    move-result v1

    if-nez v1, :cond_0

    .line 64
    invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->getDefaultWidth()I

    move-result v1

    .line 66
    :cond_0
    sget-object v2, Lcom/j256/ormlite/db/BaseDatabaseType$1;->$SwitchMap$com$j256$ormlite$field$SqlType:[I

    invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/j256/ormlite/field/SqlType;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 127
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown SQL-type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 121
    :pswitch_0
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendBigDecimalNumericType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 117
    :pswitch_1
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendSerializableType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 113
    :pswitch_2
    invoke-direct {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDoubleType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 109
    :pswitch_3
    invoke-direct {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendFloatType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 105
    :pswitch_4
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendLongType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 101
    :pswitch_5
    invoke-direct {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendIntegerType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 97
    :pswitch_6
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendShortType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 93
    :pswitch_7
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendByteArrayType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 89
    :pswitch_8
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendByteType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 85
    :pswitch_9
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendCharType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 81
    :pswitch_a
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDateType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 77
    :pswitch_b
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendBooleanType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 73
    :pswitch_c
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendLongStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    goto :goto_0

    .line 69
    :pswitch_d
    invoke-virtual {p0, p2, p3, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V

    .line 129
    :goto_0
    invoke-virtual {p2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedIdSequence()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    .line 136
    invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureGeneratedIdSequence(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p4

    move-object/from16 v7, p7

    .line 138
    invoke-virtual/range {v0 .. v7}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureGeneratedId(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isId()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    .line 141
    invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureId(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 144
    :cond_3
    :goto_1
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result v0

    if-nez v0, :cond_6

    .line 145
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "DEFAULT "

    .line 147
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    invoke-direct {p0, p2, p3, v0}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDefaultValue(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)V

    .line 149
    invoke-virtual {p2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    :cond_4
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isCanBeNull()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 152
    invoke-direct {p0, p2, p3}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendCanBeNull(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;)V

    goto :goto_2

    :cond_5
    const-string v0, "NOT NULL "

    .line 154
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    :goto_2
    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->isUnique()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    .line 157
    invoke-direct {p0, p2, p3, v0, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->addSingleUnique(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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

.method public appendCreateTableSuffix(Ljava/lang/StringBuilder;)V
    .locals 0

    return-void
.end method

.method protected appendDateType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "TIMESTAMP"

    .line 184
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x60

    .line 370
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x27

    .line 366
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendInsertNoColumns(Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "() VALUES ()"

    .line 486
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendLimitValue(Ljava/lang/StringBuilder;JLjava/lang/Long;)V
    .locals 0

    const-string p4, "LIMIT "

    .line 416
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendLongStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "TEXT"

    .line 177
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendLongType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "BIGINT"

    .line 226
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendOffsetValue(Ljava/lang/StringBuilder;J)V
    .locals 1

    const-string v0, "OFFSET "

    .line 420
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public appendSelectNextValFromSequence(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected appendSerializableType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "BLOB"

    .line 254
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendShortType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    const-string p2, "SMALLINT"

    .line 212
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method protected appendStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
    .locals 0

    .line 166
    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isVarcharFieldWidthSupported()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "VARCHAR("

    .line 167
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p2, "VARCHAR"

    .line 169
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method protected configureGeneratedId(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 296
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "GeneratedId is not supported by database "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " for field "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected configureGeneratedIdSequence(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 283
    new-instance p1, Ljava/sql/SQLException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "GeneratedIdSequence is not supported by database "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " for field "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected configureId(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public dropColumnArg(Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public extractDatabaseTableConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
    .locals 0
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

    const/4 p1, 0x0

    return-object p1
.end method

.method public generateIdSequenceName(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
    .locals 0

    .line 374
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/j256/ormlite/db/BaseDatabaseType;->DEFAULT_SEQUENCE_SUFFIX:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 375
    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isEntityNamesMustBeUpCase()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 376
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method protected generatedIdSqlAtEnd()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getCommentLinePrefix()Ljava/lang/String;
    .locals 1

    const-string v0, "-- "

    return-object v0
.end method

.method protected abstract getDriverClassName()Ljava/lang/String;
.end method

.method public getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
    .locals 0

    return-object p1
.end method

.method public getPingStatement()Ljava/lang/String;
    .locals 1

    const-string v0, "SELECT 1"

    return-object v0
.end method

.method public isAllowGeneratedIdInsertSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isBatchUseTransaction()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCreateIfNotExistsSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCreateIndexIfNotExistsSupported()Z
    .locals 1

    .line 464
    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isCreateIfNotExistsSupported()Z

    move-result v0

    return v0
.end method

.method public isCreateTableReturnsNegative()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCreateTableReturnsZero()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isEntityNamesMustBeUpCase()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isIdSequenceNeeded()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isLimitAfterSelect()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isLimitSqlSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isNestedSavePointsSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isOffsetLimitArgument()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isOffsetSqlSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isSelectSequenceBeforeInsert()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isTruncateSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isVarcharFieldWidthSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public loadDriver()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 39
    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDriverClassName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 43
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Driver class was not found for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " database.  Missing jar with class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public setDriver(Ljava/sql/Driver;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/j256/ormlite/db/BaseDatabaseType;->driver:Ljava/sql/Driver;

    return-void
.end method
