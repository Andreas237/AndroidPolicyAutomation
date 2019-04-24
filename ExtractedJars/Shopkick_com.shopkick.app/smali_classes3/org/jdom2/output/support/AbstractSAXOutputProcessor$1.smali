.class synthetic Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;
.super Ljava/lang/Object;
.source "AbstractSAXOutputProcessor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/AbstractSAXOutputProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$org$jdom2$AttributeType:[I

.field static final synthetic $SwitchMap$org$jdom2$Content$CType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 719
    invoke-static {}, Lorg/jdom2/AttributeType;->values()[Lorg/jdom2/AttributeType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$AttributeType:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$AttributeType:[I

    sget-object v2, Lorg/jdom2/AttributeType;->UNDECLARED:Lorg/jdom2/AttributeType;

    invoke-virtual {v2}, Lorg/jdom2/AttributeType;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    :catch_0
    invoke-static {}, Lorg/jdom2/Content$CType;->values()[Lorg/jdom2/Content$CType;

    move-result-object v1

    array-length v1, v1

    new-array v1, v1, [I

    sput-object v1, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    :try_start_1
    sget-object v1, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v2, Lorg/jdom2/Content$CType;->Comment:Lorg/jdom2/Content$CType;

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->DocType:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->Element:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->ProcessingInstruction:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->CDATA:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->EntityRef:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Lorg/jdom2/output/support/AbstractSAXOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    return-void
.end method
