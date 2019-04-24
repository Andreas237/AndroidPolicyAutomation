.class public Lcom/squareup/haha/perflib/HprofParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ALLOC_SITES:I = 0x6

.field private static final CONTROL_SETTINGS:I = 0xe

.field private static final CPU_SAMPLES:I = 0xd

.field private static final END_THREAD:I = 0xb

.field private static final HEAP_DUMP:I = 0xc

.field private static final HEAP_DUMP_END:I = 0x2c

.field private static final HEAP_DUMP_SEGMENT:I = 0x1c

.field private static final HEAP_SUMMARY:I = 0x7

.field private static final LOAD_CLASS:I = 0x2

.field private static final ROOT_CLASS_DUMP:I = 0x20

.field private static final ROOT_DEBUGGER:I = 0x8b

.field private static final ROOT_FINALIZING:I = 0x8a

.field private static final ROOT_HEAP_DUMP_INFO:I = 0xfe

.field private static final ROOT_INSTANCE_DUMP:I = 0x21

.field private static final ROOT_INTERNED_STRING:I = 0x89

.field private static final ROOT_JAVA_FRAME:I = 0x3

.field private static final ROOT_JNI_GLOBAL:I = 0x1

.field private static final ROOT_JNI_LOCAL:I = 0x2

.field private static final ROOT_JNI_MONITOR:I = 0x8e

.field private static final ROOT_MONITOR_USED:I = 0x7

.field private static final ROOT_NATIVE_STACK:I = 0x4

.field private static final ROOT_OBJECT_ARRAY_DUMP:I = 0x22

.field private static final ROOT_PRIMITIVE_ARRAY_DUMP:I = 0x23

.field private static final ROOT_PRIMITIVE_ARRAY_NODATA:I = 0xc3

.field private static final ROOT_REFERENCE_CLEANUP:I = 0x8c

.field private static final ROOT_STICKY_CLASS:I = 0x5

.field private static final ROOT_THREAD_BLOCK:I = 0x6

.field private static final ROOT_THREAD_OBJECT:I = 0x8

.field private static final ROOT_UNKNOWN:I = 0xff

.field private static final ROOT_UNREACHABLE:I = 0x90

.field private static final ROOT_VM_INTERNAL:I = 0x8d

.field private static final STACK_FRAME:I = 0x4

.field private static final STACK_TRACE:I = 0x5

.field private static final START_THREAD:I = 0xa

.field private static final STRING_IN_UTF8:I = 0x1

.field private static final UNLOAD_CLASS:I = 0x3


# instance fields
.field mClassNames:Lcom/squareup/haha/trove/TLongObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TLongObjectHashMap<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field mIdSize:I

.field private final mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

.field mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

.field mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TLongObjectHashMap<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/haha/perflib/io/HprofBuffer;)V
    .locals 1

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance v0, Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    .line 136
    new-instance v0, Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mClassNames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    .line 140
    iput-object p1, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    .line 141
    return-void
.end method

.method private loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 454
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    .line 455
    new-instance v3, Lcom/squareup/haha/perflib/RootObj;

    invoke-direct {v3, p1, v1, v2}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;J)V

    .line 457
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v3}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 459
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    return v0
.end method

.method private loadClass()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 265
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    .line 266
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v3

    .line 267
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    .line 268
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 270
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mClassNames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, v3, v4, v5}, Lcom/squareup/haha/trove/TLongObjectHashMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 271
    return-void
.end method

.method private loadClassDump()I
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 486
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v7

    .line 487
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v9

    .line 488
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v9}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v10

    .line 489
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v11

    .line 490
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v13

    .line 491
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    .line 492
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    .line 493
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    .line 494
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    .line 495
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v15

    .line 497
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    mul-int/lit8 v0, v0, 0x7

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v16, v0, 0x4

    .line 500
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedShort()I

    move-result v17

    .line 501
    add-int/lit8 v16, v16, 0x2

    .line 503
    const/16 v18, 0x0

    :goto_0
    move/from16 v0, v18

    move/from16 v1, v17

    if-ge v0, v1, :cond_0

    .line 504
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedShort()I

    .line 505
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->skipValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    add-int v16, v16, v0

    .line 503
    add-int/lit8 v18, v18, 0x1

    goto :goto_0

    .line 508
    :cond_0
    new-instance v0, Lcom/squareup/haha/perflib/ClassObj;

    move-wide v1, v7

    move-object v3, v10

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/squareup/haha/perflib/HprofParser;->mClassNames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v4, v7, v8}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v5}, Lcom/squareup/haha/perflib/io/HprofBuffer;->position()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/squareup/haha/perflib/ClassObj;-><init>(JLcom/squareup/haha/perflib/StackTrace;Ljava/lang/String;J)V

    .line 509
    move-object/from16 v18, v0

    invoke-virtual {v0, v11, v12}, Lcom/squareup/haha/perflib/ClassObj;->setSuperClassId(J)V

    .line 510
    move-object/from16 v0, v18

    invoke-virtual {v0, v13, v14}, Lcom/squareup/haha/perflib/ClassObj;->setClassLoaderId(J)V

    .line 513
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedShort()I

    move-result v17

    .line 514
    add-int/lit8 v16, v16, 0x2

    .line 516
    move/from16 v0, v17

    new-array v0, v0, [Lcom/squareup/haha/perflib/Field;

    move-object/from16 v19, v0

    .line 518
    const/16 v20, 0x0

    :goto_1
    move/from16 v0, v20

    move/from16 v1, v17

    if-ge v0, v1, :cond_1

    .line 519
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/String;

    .line 520
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    invoke-static {v0}, Lcom/squareup/haha/perflib/Type;->getType(I)Lcom/squareup/haha/perflib/Type;

    move-result-object v22

    .line 522
    new-instance v0, Lcom/squareup/haha/perflib/Field;

    move-object/from16 v1, v22

    move-object/from16 v2, v21

    invoke-direct {v0, v1, v2}, Lcom/squareup/haha/perflib/Field;-><init>(Lcom/squareup/haha/perflib/Type;Ljava/lang/String;)V

    aput-object v0, v19, v20

    .line 523
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V

    .line 525
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    move-object/from16 v2, v22

    invoke-virtual {v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v1

    add-int/2addr v0, v1

    add-int v16, v16, v0

    .line 518
    add-int/lit8 v20, v20, 0x1

    goto :goto_1

    .line 528
    :cond_1
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/ClassObj;->setStaticFields([Lcom/squareup/haha/perflib/Field;)V

    .line 531
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedShort()I

    move-result v17

    .line 532
    add-int/lit8 v16, v16, 0x2

    .line 534
    move/from16 v0, v17

    new-array v0, v0, [Lcom/squareup/haha/perflib/Field;

    move-object/from16 v20, v0

    .line 536
    const/16 v21, 0x0

    :goto_2
    move/from16 v0, v21

    move/from16 v1, v17

    if-ge v0, v1, :cond_2

    .line 537
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/String;

    .line 538
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedByte()I

    move-result v0

    invoke-static {v0}, Lcom/squareup/haha/perflib/Type;->getType(I)Lcom/squareup/haha/perflib/Type;

    move-result-object v23

    .line 540
    new-instance v0, Lcom/squareup/haha/perflib/Field;

    move-object/from16 v1, v23

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lcom/squareup/haha/perflib/Field;-><init>(Lcom/squareup/haha/perflib/Type;Ljava/lang/String;)V

    aput-object v0, v20, v21

    .line 542
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x1

    add-int v16, v16, v0

    .line 536
    add-int/lit8 v21, v21, 0x1

    goto :goto_2

    .line 545
    :cond_2
    move-object/from16 v0, v18

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/ClassObj;->setFields([Lcom/squareup/haha/perflib/Field;)V

    .line 546
    move-object/from16 v0, v18

    invoke-virtual {v0, v15}, Lcom/squareup/haha/perflib/ClassObj;->setInstanceSize(I)V

    .line 548
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    move-object/from16 v1, v18

    invoke-virtual {v0, v7, v8, v1}, Lcom/squareup/haha/perflib/Snapshot;->addClass(JLcom/squareup/haha/perflib/ClassObj;)V

    .line 550
    return v16
.end method

.method private loadHeapDump(J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 303
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 304
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedByte()I

    move-result v4

    .line 305
    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    .line 307
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 309
    :sswitch_0
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 310
    goto/16 :goto_0

    .line 313
    :sswitch_1
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->NATIVE_STATIC:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 314
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    .line 315
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 316
    goto/16 :goto_0

    .line 319
    :sswitch_2
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadJniLocal()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 320
    goto/16 :goto_0

    .line 323
    :sswitch_3
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadJavaFrame()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 324
    goto/16 :goto_0

    .line 327
    :sswitch_4
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadNativeStack()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 328
    goto/16 :goto_0

    .line 331
    :sswitch_5
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 332
    goto/16 :goto_0

    .line 335
    :sswitch_6
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadThreadBlock()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 336
    goto/16 :goto_0

    .line 339
    :sswitch_7
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->BUSY_MONITOR:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 340
    goto/16 :goto_0

    .line 343
    :sswitch_8
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadThreadObject()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 344
    goto/16 :goto_0

    .line 347
    :sswitch_9
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadClassDump()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 348
    goto/16 :goto_0

    .line 351
    :sswitch_a
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadInstanceDump()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 352
    goto/16 :goto_0

    .line 355
    :sswitch_b
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadObjectArrayDump()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 356
    goto/16 :goto_0

    .line 359
    :sswitch_c
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadPrimitiveArrayDump()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 360
    goto/16 :goto_0

    .line 363
    :sswitch_d
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "+--- PRIMITIVE ARRAY NODATA DUMP"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 364
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadPrimitiveArrayDump()I

    .line 366
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Don\'t know how to load a nodata array"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :sswitch_e
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v5

    .line 371
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 372
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, v6, v7}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 374
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v5, v8}, Lcom/squareup/haha/perflib/Snapshot;->setHeapTo(ILjava/lang/String;)Lcom/squareup/haha/perflib/Heap;

    .line 375
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 376
    goto/16 :goto_0

    .line 379
    :sswitch_f
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->INTERNED_STRING:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 380
    goto/16 :goto_0

    .line 383
    :sswitch_10
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->FINALIZING:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 384
    goto/16 :goto_0

    .line 387
    :sswitch_11
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->DEBUGGER:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 388
    goto/16 :goto_0

    .line 391
    :sswitch_12
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->REFERENCE_CLEANUP:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 392
    goto/16 :goto_0

    .line 395
    :sswitch_13
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->VM_INTERNAL:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 396
    goto/16 :goto_0

    .line 399
    :sswitch_14
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadJniMonitor()I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 400
    goto/16 :goto_0

    .line 403
    :sswitch_15
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->UNREACHABLE:Lcom/squareup/haha/perflib/RootType;

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadBasicObj(Lcom/squareup/haha/perflib/RootType;)I

    move-result v0

    int-to-long v0, v0

    sub-long/2addr p1, v0

    .line 404
    goto/16 :goto_0

    .line 407
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "loadHeapDump loop with unknown tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v2}, Lcom/squareup/haha/perflib/io/HprofBuffer;->remaining()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes possibly remaining"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 413
    :cond_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x20 -> :sswitch_9
        0x21 -> :sswitch_a
        0x22 -> :sswitch_b
        0x23 -> :sswitch_c
        0x89 -> :sswitch_f
        0x8a -> :sswitch_10
        0x8b -> :sswitch_11
        0x8c -> :sswitch_12
        0x8d -> :sswitch_13
        0x8e -> :sswitch_14
        0x90 -> :sswitch_15
        0xc3 -> :sswitch_d
        0xfe -> :sswitch_e
        0xff -> :sswitch_0
    .end sparse-switch
.end method

.method private loadInstanceDump()I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 554
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 556
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v9

    .line 557
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v10

    .line 558
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v12

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->position()J

    move-result-wide v13

    .line 561
    new-instance v0, Lcom/squareup/haha/perflib/ClassInstance;

    move-wide v1, v6

    move-object v3, v9

    move-wide v4, v13

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/ClassInstance;-><init>(JLcom/squareup/haha/perflib/StackTrace;J)V

    .line 562
    move-object v15, v0

    invoke-virtual {v0, v10, v11}, Lcom/squareup/haha/perflib/ClassInstance;->setClassId(J)V

    .line 563
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v6, v7, v15}, Lcom/squareup/haha/perflib/Snapshot;->addInstance(JLcom/squareup/haha/perflib/Instance;)V

    .line 565
    int-to-long v0, v12

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V

    .line 566
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    move-object/from16 v1, p0

    iget v1, v1, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v12

    return v0
.end method

.method private loadJavaFrame()I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 429
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 430
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 431
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v9

    .line 432
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v10

    .line 433
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, v10, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    invoke-virtual {v0, v1, v9}, Lcom/squareup/haha/perflib/Snapshot;->getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v11

    .line 434
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->JAVA_LOCAL:Lcom/squareup/haha/perflib/RootType;

    move-wide v2, v6

    move v4, v8

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    move-object v12, v0

    .line 436
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v12}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 438
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private loadJniLocal()I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 416
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 417
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 418
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v9

    .line 419
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v10

    .line 420
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, v10, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    invoke-virtual {v0, v1, v9}, Lcom/squareup/haha/perflib/Snapshot;->getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v11

    .line 421
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_LOCAL:Lcom/squareup/haha/perflib/RootType;

    move-wide v2, v6

    move v4, v8

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    move-object v12, v0

    .line 423
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v12}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 425
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private loadJniMonitor()I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 601
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 602
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 603
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v9

    .line 604
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v10

    .line 605
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, v10, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    invoke-virtual {v0, v1, v9}, Lcom/squareup/haha/perflib/Snapshot;->getStackTraceAtDepth(II)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v11

    .line 606
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_MONITOR:Lcom/squareup/haha/perflib/RootType;

    move-wide v2, v6

    move v4, v8

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    move-object v12, v0

    .line 608
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v12}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 610
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private loadNativeStack()I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 442
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 443
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 444
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v9

    .line 445
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, v9, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v10

    .line 446
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->NATIVE_STACK:Lcom/squareup/haha/perflib/RootType;

    move-wide v2, v6

    move v4, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    move-object v11, v0

    .line 448
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v11}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 450
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private loadObjectArrayDump()I
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 570
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v8

    .line 571
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v10

    .line 572
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v10}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v11

    .line 573
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v12

    .line 574
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v13

    .line 575
    new-instance v0, Lcom/squareup/haha/perflib/ArrayInstance;

    move-wide v1, v8

    move-object v3, v11

    sget-object v4, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    move v5, v12

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v6}, Lcom/squareup/haha/perflib/io/HprofBuffer;->position()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/squareup/haha/perflib/ArrayInstance;-><init>(JLcom/squareup/haha/perflib/StackTrace;Lcom/squareup/haha/perflib/Type;IJ)V

    .line 577
    move-object v15, v0

    invoke-virtual {v0, v13, v14}, Lcom/squareup/haha/perflib/ArrayInstance;->setClassId(J)V

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8, v9, v15}, Lcom/squareup/haha/perflib/Snapshot;->addInstance(JLcom/squareup/haha/perflib/Instance;)V

    .line 580
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    mul-int v16, v12, v0

    .line 581
    move/from16 v0, v16

    int-to-long v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V

    .line 582
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    move-object/from16 v1, p0

    iget v1, v1, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/2addr v0, v1

    add-int v0, v0, v16

    return v0
.end method

.method private loadPrimitiveArrayDump()I
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 586
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v8

    .line 587
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v10

    .line 588
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v10}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v11

    .line 589
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v12

    .line 590
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedByte()I

    move-result v0

    invoke-static {v0}, Lcom/squareup/haha/perflib/Type;->getType(I)Lcom/squareup/haha/perflib/Type;

    move-result-object v13

    .line 591
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v13}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v14

    .line 592
    new-instance v0, Lcom/squareup/haha/perflib/ArrayInstance;

    move-wide v1, v8

    move-object v3, v11

    move-object v4, v13

    move v5, v12

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v6}, Lcom/squareup/haha/perflib/io/HprofBuffer;->position()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/squareup/haha/perflib/ArrayInstance;-><init>(JLcom/squareup/haha/perflib/StackTrace;Lcom/squareup/haha/perflib/Type;IJ)V

    move-object v15, v0

    .line 593
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8, v9, v15}, Lcom/squareup/haha/perflib/Snapshot;->addInstance(JLcom/squareup/haha/perflib/Instance;)V

    .line 595
    mul-int v16, v12, v14

    .line 596
    move/from16 v0, v16

    int-to-long v0, v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V

    .line 597
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x1

    add-int v0, v0, v16

    return v0
.end method

.method private loadStackFrame()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v8

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 276
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 277
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct/range {p0 .. p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/trove/TLongObjectHashMap;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 278
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v13

    .line 279
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v14

    .line 281
    new-instance v0, Lcom/squareup/haha/perflib/StackFrame;

    move-wide v1, v8

    move-object v3, v10

    move-object v4, v11

    move-object v5, v12

    move v6, v13

    move v7, v14

    invoke-direct/range {v0 .. v7}, Lcom/squareup/haha/perflib/StackFrame;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v15, v0

    .line 284
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v15}, Lcom/squareup/haha/perflib/Snapshot;->addStackFrame(Lcom/squareup/haha/perflib/StackFrame;)V

    .line 285
    return-void
.end method

.method private loadStackTrace()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v3

    .line 289
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v4

    .line 290
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    .line 291
    move v5, v0

    new-array v6, v0, [Lcom/squareup/haha/perflib/StackFrame;

    .line 293
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_0

    .line 294
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->getStackFrame(J)Lcom/squareup/haha/perflib/StackFrame;

    move-result-object v0

    aput-object v0, v6, v7

    .line 293
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 297
    :cond_0
    new-instance v7, Lcom/squareup/haha/perflib/StackTrace;

    invoke-direct {v7, v3, v4, v6}, Lcom/squareup/haha/perflib/StackTrace;-><init>(II[Lcom/squareup/haha/perflib/StackFrame;)V

    .line 299
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v7}, Lcom/squareup/haha/perflib/Snapshot;->addStackTrace(Lcom/squareup/haha/perflib/StackTrace;)V

    .line 300
    return-void
.end method

.method private loadString(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 258
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v1

    .line 259
    invoke-direct {p0, p1}, Lcom/squareup/haha/perflib/HprofParser;->readUTF8(I)Ljava/lang/String;

    move-result-object v3

    .line 261
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0, v1, v2, v3}, Lcom/squareup/haha/trove/TLongObjectHashMap;->put(JLjava/lang/Object;)Ljava/lang/Object;

    .line 262
    return-void
.end method

.method private loadThreadBlock()I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 463
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v6

    .line 464
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v8

    .line 465
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v8}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v9

    .line 466
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, v9, Lcom/squareup/haha/perflib/ThreadObj;->mStackTrace:I

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->getStackTrace(I)Lcom/squareup/haha/perflib/StackTrace;

    move-result-object v10

    .line 467
    new-instance v0, Lcom/squareup/haha/perflib/RootObj;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->THREAD_BLOCK:Lcom/squareup/haha/perflib/RootType;

    move-wide v2, v6

    move v4, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    move-object v11, v0

    .line 469
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v11}, Lcom/squareup/haha/perflib/Snapshot;->addRoot(Lcom/squareup/haha/perflib/RootObj;)V

    .line 471
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private loadThreadObject()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 475
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readId()J

    move-result-wide v2

    .line 476
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v4

    .line 477
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v5

    .line 478
    new-instance v6, Lcom/squareup/haha/perflib/ThreadObj;

    invoke-direct {v6, v2, v3, v5}, Lcom/squareup/haha/perflib/ThreadObj;-><init>(JI)V

    .line 480
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v6, v4}, Lcom/squareup/haha/perflib/Snapshot;->addThread(Lcom/squareup/haha/perflib/ThreadObj;I)V

    .line 482
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private readId()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 222
    iget v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 224
    :pswitch_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 226
    :pswitch_1
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readShort()S

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 228
    :pswitch_2
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 230
    :pswitch_3
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readLong()J

    move-result-wide v0

    return-wide v0

    .line 233
    :goto_0
    :pswitch_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ID Length must be 1, 2, 4, or 8"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private readNullTerminatedString()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 213
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v2

    :goto_0
    if-eqz v2, :cond_0

    .line 215
    int-to-char v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 214
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v2

    goto :goto_0

    .line 217
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private readUTF8(I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 238
    new-array v2, p1, [B

    .line 240
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0, v2}, Lcom/squareup/haha/perflib/io/HprofBuffer;->read([B)V

    .line 242
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method private readUnsignedByte()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    .line 1075
    move v2, v0

    and-int/lit16 v0, v0, 0xff

    .line 246
    return v0
.end method

.method private readUnsignedInt()J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 254
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    .line 2075
    move v4, v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 254
    return-wide v0
.end method

.method private readUnsignedShort()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 250
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method private skipFully(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 623
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    iget-object v1, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v1}, Lcom/squareup/haha/perflib/io/HprofBuffer;->position()J

    move-result-wide v1

    add-long/2addr v1, p1

    invoke-interface {v0, v1, v2}, Lcom/squareup/haha/perflib/io/HprofBuffer;->setPosition(J)V

    .line 624
    return-void
.end method

.method private skipValue()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 614
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedByte()I

    move-result v0

    invoke-static {v0}, Lcom/squareup/haha/perflib/Type;->getType(I)Lcom/squareup/haha/perflib/Type;

    move-result-object v2

    .line 615
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v2}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v3

    .line 617
    int-to-long v0, v3

    invoke-direct {p0, v0, v1}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V

    .line 619
    add-int/lit8 v0, v3, 0x1

    return v0
.end method


# virtual methods
.method public final parse()Lcom/squareup/haha/perflib/Snapshot;
    .locals 6

    .line 145
    new-instance v2, Lcom/squareup/haha/perflib/Snapshot;

    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-direct {v2, v0}, Lcom/squareup/haha/perflib/Snapshot;-><init>(Lcom/squareup/haha/perflib/io/HprofBuffer;)V

    .line 146
    iput-object v2, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    .line 150
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readNullTerminatedString()Ljava/lang/String;

    .line 152
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    iput v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    .line 153
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget v1, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->setIdSize(I)V

    .line 155
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readLong()J

    .line 157
    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedByte()I

    move-result v3

    .line 159
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mInput:Lcom/squareup/haha/perflib/io/HprofBuffer;

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    .line 160
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->readUnsignedInt()J

    move-result-wide v4

    .line 162
    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    .line 165
    :sswitch_0
    long-to-int v0, v4

    iget v1, p0, Lcom/squareup/haha/perflib/HprofParser;->mIdSize:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/squareup/haha/perflib/HprofParser;->loadString(I)V

    .line 166
    goto :goto_0

    .line 169
    :sswitch_1
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadClass()V

    .line 170
    goto :goto_0

    .line 173
    :sswitch_2
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadStackFrame()V

    .line 174
    goto :goto_0

    .line 177
    :sswitch_3
    invoke-direct {p0}, Lcom/squareup/haha/perflib/HprofParser;->loadStackTrace()V

    .line 178
    goto :goto_0

    .line 181
    :sswitch_4
    invoke-direct {p0, v4, v5}, Lcom/squareup/haha/perflib/HprofParser;->loadHeapDump(J)V

    .line 182
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->setToDefaultHeap()Lcom/squareup/haha/perflib/Heap;

    .line 183
    goto/16 :goto_0

    .line 186
    :sswitch_5
    invoke-direct {p0, v4, v5}, Lcom/squareup/haha/perflib/HprofParser;->loadHeapDump(J)V

    .line 187
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->setToDefaultHeap()Lcom/squareup/haha/perflib/Heap;

    .line 188
    goto/16 :goto_0

    .line 191
    :goto_1
    invoke-direct {p0, v4, v5}, Lcom/squareup/haha/perflib/HprofParser;->skipFully(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 194
    goto/16 :goto_0

    .line 197
    :cond_0
    nop

    .line 195
    .line 198
    :catch_0
    :try_start_1
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->resolveClasses()V

    .line 199
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Snapshot;->resolveReferences()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 204
    goto :goto_2

    .line 202
    :catch_1
    move-exception v3

    .line 203
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 206
    :goto_2
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mClassNames:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->clear()V

    .line 207
    iget-object v0, p0, Lcom/squareup/haha/perflib/HprofParser;->mStrings:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-virtual {v0}, Lcom/squareup/haha/trove/TLongObjectHashMap;->clear()V

    .line 208
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
        0x5 -> :sswitch_3
        0xc -> :sswitch_4
        0x1c -> :sswitch_5
    .end sparse-switch
.end method
