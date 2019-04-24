.class public abstract enum Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;
.super Ljava/lang/Enum;
.source "InstructionCodec.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_00X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_10T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_10X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_11N:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_11X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_12X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_20BC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_20T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_21C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_21H:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_21S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_21T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22B:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22CS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_22X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_23X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_30T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_31C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_31I:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_31T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_32S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_32X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_33X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_35C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_35MI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_35MS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_3RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_3RMI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_3RMS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_40SC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_41C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_51L:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_52C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_5RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_FILL_ARRAY_DATA_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_PACKED_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

.field public static final enum FORMAT_SPARSE_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 32
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;

    const-string v1, "FORMAT_00X"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_00X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 45
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$2;

    const-string v1, "FORMAT_10X"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_10X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 60
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$3;

    const-string v1, "FORMAT_12X"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_12X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 79
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$4;

    const-string v1, "FORMAT_11N"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_11N:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 98
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$5;

    const-string v1, "FORMAT_11X"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_11X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 114
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$6;

    const-string v1, "FORMAT_10T"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_10T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 131
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$7;

    const-string v1, "FORMAT_20T"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_20T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 149
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$8;

    const-string v1, "FORMAT_20BC"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_20BC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 168
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$9;

    const-string v1, "FORMAT_22X"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$9;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 187
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$10;

    const-string v1, "FORMAT_21T"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$10;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 206
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$11;

    const-string v1, "FORMAT_21S"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$11;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 225
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$12;

    const-string v1, "FORMAT_21H"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$12;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21H:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 255
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$13;

    const-string v1, "FORMAT_21C"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$13;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 275
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$14;

    const-string v1, "FORMAT_23X"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$14;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_23X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 296
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$15;

    const-string v1, "FORMAT_22B"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$15;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22B:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 318
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$16;

    const-string v1, "FORMAT_22T"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$16;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 341
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$17;

    const-string v1, "FORMAT_22S"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$17;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 362
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$18;

    const-string v1, "FORMAT_22C"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$18;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 384
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$19;

    const-string v1, "FORMAT_22CS"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$19;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22CS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 405
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$20;

    const-string v1, "FORMAT_30T"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_30T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 424
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$21;

    const-string v1, "FORMAT_32X"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$21;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_32X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 442
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$22;

    const-string v1, "FORMAT_31I"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$22;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31I:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 463
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$23;

    const-string v1, "FORMAT_31T"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$23;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 497
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$24;

    const-string v1, "FORMAT_31C"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$24;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 519
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$25;

    const-string v1, "FORMAT_35C"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$25;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 530
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$26;

    const-string v1, "FORMAT_35MS"

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$26;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35MS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 541
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$27;

    const-string v1, "FORMAT_35MI"

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$27;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35MI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 552
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$28;

    const-string v1, "FORMAT_3RC"

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$28;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 563
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$29;

    const-string v1, "FORMAT_3RMS"

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$29;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RMS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 574
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$30;

    const-string v1, "FORMAT_3RMI"

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$30;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RMI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 585
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$31;

    const-string v1, "FORMAT_51L"

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$31;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_51L:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 608
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$32;

    const-string v1, "FORMAT_33X"

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$32;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_33X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 629
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$33;

    const-string v1, "FORMAT_32S"

    const/16 v15, 0x20

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$33;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_32S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 650
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$34;

    const-string v1, "FORMAT_40SC"

    const/16 v15, 0x21

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$34;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_40SC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 671
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$35;

    const-string v1, "FORMAT_41C"

    const/16 v15, 0x22

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$35;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_41C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 693
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$36;

    const-string v1, "FORMAT_52C"

    const/16 v15, 0x23

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$36;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_52C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 717
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$37;

    const-string v1, "FORMAT_5RC"

    const/16 v15, 0x24

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$37;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_5RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 741
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$38;

    const-string v1, "FORMAT_PACKED_SWITCH_PAYLOAD"

    const/16 v15, 0x25

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$38;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_PACKED_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 773
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$39;

    const-string v1, "FORMAT_SPARSE_SWITCH_PAYLOAD"

    const/16 v15, 0x26

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$39;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_SPARSE_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    .line 813
    new-instance v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$40;

    const-string v1, "FORMAT_FILL_ARRAY_DATA_PAYLOAD"

    const/16 v15, 0x27

    invoke-direct {v0, v1, v15}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec$40;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_FILL_ARRAY_DATA_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v0, 0x28

    .line 31
    new-array v0, v0, [Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_00X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_10X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_12X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_11N:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_11X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_10T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v7

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_20T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v8

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_20BC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v9

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v10

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v11

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v12

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21H:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v13

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_21C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    aput-object v1, v0, v14

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_23X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22B:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_22CS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_30T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_32X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31I:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31T:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_31C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35MS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_35MI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RMS:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_3RMI:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_51L:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_33X:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_32S:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_40SC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_41C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_52C:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_5RC:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_PACKED_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_SPARSE_SWITCH_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->FORMAT_FILL_ARRAY_DATA_PAYLOAD:Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->$VALUES:[Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/dexmaker/dx/io/instructions/InstructionCodec$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$100(I)I
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->byte0(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$1000(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->encodeRegisterList(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 31
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->decodeRegisterRange(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1200(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->encodeRegisterRange(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V

    return-void
.end method

.method static synthetic access$1300(J)S
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit0(J)S

    move-result p0

    return p0
.end method

.method static synthetic access$1400(J)S
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit1(J)S

    move-result p0

    return p0
.end method

.method static synthetic access$1500(J)S
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit2(J)S

    move-result p0

    return p0
.end method

.method static synthetic access$1600(J)S
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit3(J)S

    move-result p0

    return p0
.end method

.method static synthetic access$1700(I)S
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->asUnsignedUnit(I)S

    move-result p0

    return p0
.end method

.method static synthetic access$200(I)I
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->byte1(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$300(I)I
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble2(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$400(I)I
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble3(I)I

    move-result p0

    return p0
.end method

.method static synthetic access$500(II)I
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->makeByte(II)I

    move-result p0

    return p0
.end method

.method static synthetic access$600(II)S
    .locals 0

    .line 31
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->codeUnit(II)S

    move-result p0

    return p0
.end method

.method static synthetic access$700(I)S
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit0(I)S

    move-result p0

    return p0
.end method

.method static synthetic access$800(I)S
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->unit1(I)S

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 31
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->decodeRegisterList(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;

    move-result-object p0

    return-object p0
.end method

.method private static asUnsignedUnit(I)S
    .locals 1

    const/high16 v0, -0x10000

    and-int/2addr v0, p0

    if-nez v0, :cond_0

    int-to-short p0, p0

    return p0

    .line 1038
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus unsigned code unit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static byte0(I)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private static byte1(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private static byte2(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x10

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private static byte3(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x18

    return p0
.end method

.method private static codeUnit(II)S
    .locals 1

    and-int/lit16 v0, p0, -0x100

    if-nez v0, :cond_1

    and-int/lit16 v0, p1, -0x100

    if-nez v0, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 996
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus highByte"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 992
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus lowByte"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static codeUnit(IIII)S
    .locals 1

    and-int/lit8 v0, p0, -0x10

    if-nez v0, :cond_3

    and-int/lit8 v0, p1, -0x10

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, -0x10

    if-nez v0, :cond_1

    and-int/lit8 v0, p3, -0x10

    if-nez v0, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    shl-int/lit8 p1, p3, 0xc

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 1017
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus nibble3"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1013
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus nibble2"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1009
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus nibble1"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1005
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus nibble0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static decodeRegisterList(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 904
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->byte0(I)I

    move-result v2

    .line 905
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble2(I)I

    move-result v12

    .line 906
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble3(I)I

    move-result p1

    .line 907
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v3

    .line 908
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result p2

    .line 909
    invoke-static {p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble0(I)I

    move-result v8

    .line 910
    invoke-static {p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble1(I)I

    move-result v9

    .line 911
    invoke-static {p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble2(I)I

    move-result v10

    .line 912
    invoke-static {p2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->nibble3(I)I

    move-result v11

    .line 913
    invoke-static {v2}, Lcom/google/dexmaker/dx/io/OpcodeInfo;->getIndexType(I)Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    packed-switch p1, :pswitch_data_0

    .line 948
    new-instance p0, Lcom/google/dexmaker/dx/util/DexException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "bogus registerCount: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->uNibble(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/DexException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 942
    :pswitch_0
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v12}, Lcom/google/dexmaker/dx/io/instructions/FiveRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIIII)V

    return-object p1

    .line 937
    :pswitch_1
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v11}, Lcom/google/dexmaker/dx/io/instructions/FourRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIIII)V

    return-object p1

    .line 932
    :pswitch_2
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v10}, Lcom/google/dexmaker/dx/io/instructions/ThreeRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJIII)V

    return-object p1

    .line 927
    :pswitch_3
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v9}, Lcom/google/dexmaker/dx/io/instructions/TwoRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V

    return-object p1

    .line 922
    :pswitch_4
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/google/dexmaker/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJI)V

    return-object p1

    .line 918
    :pswitch_5
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/dexmaker/dx/io/instructions/ZeroRegisterDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJ)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static decodeRegisterRange(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 969
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->byte0(I)I

    move-result v2

    .line 970
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->byte1(I)I

    move-result v9

    .line 971
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v3

    .line 972
    invoke-interface {p2}, Lcom/google/dexmaker/dx/io/instructions/CodeInput;->read()I

    move-result v8

    .line 973
    invoke-static {v2}, Lcom/google/dexmaker/dx/io/OpcodeInfo;->getIndexType(I)Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v4

    .line 974
    new-instance p1, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v9}, Lcom/google/dexmaker/dx/io/instructions/RegisterRangeDecodedInstruction;-><init>(Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;IILcom/google/dexmaker/dx/io/IndexType;IJII)V

    return-object p1
.end method

.method private static encodeRegisterList(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 5

    .line 957
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getE()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getRegisterCount()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->makeByte(II)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->codeUnit(II)S

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    move-result v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getA()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getB()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getC()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getD()I

    move-result p0

    invoke-static {v2, v3, v4, p0}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->codeUnit(IIII)S

    move-result p0

    invoke-interface {p1, v0, v1, p0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSS)V

    return-void
.end method

.method private static encodeRegisterRange(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 985
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getRegisterCount()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->codeUnit(II)S

    move-result v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    move-result v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getAUnit()S

    move-result p0

    invoke-interface {p1, v0, v1, p0}, Lcom/google/dexmaker/dx/io/instructions/CodeOutput;->write(SSS)V

    return-void
.end method

.method private static makeByte(II)I
    .locals 1

    and-int/lit8 v0, p0, -0x10

    if-nez v0, :cond_1

    and-int/lit8 v0, p1, -0x10

    if-nez v0, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    return p0

    .line 1030
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus highNibble"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1026
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus lowNibble"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static nibble0(I)I
    .locals 0

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method private static nibble1(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x4

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method private static nibble2(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x8

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method private static nibble3(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0xc

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method private static unit0(I)S
    .locals 0

    int-to-short p0, p0

    return p0
.end method

.method private static unit0(J)S
    .locals 0

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method private static unit1(I)S
    .locals 0

    shr-int/lit8 p0, p0, 0x10

    int-to-short p0, p0

    return p0
.end method

.method private static unit1(J)S
    .locals 1

    const/16 v0, 0x10

    shr-long/2addr p0, v0

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method private static unit2(J)S
    .locals 1

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method private static unit3(J)S
    .locals 1

    const/16 v0, 0x30

    shr-long/2addr p0, v0

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;
    .locals 1

    .line 31
    const-class v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;
    .locals 1

    .line 31
    sget-object v0, Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->$VALUES:[Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/io/instructions/InstructionCodec;

    return-object v0
.end method


# virtual methods
.method public abstract decode(ILcom/google/dexmaker/dx/io/instructions/CodeInput;)Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation
.end method

.method public abstract encode(Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/CodeOutput;)V
.end method
