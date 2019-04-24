.class synthetic Lorg/jdom2/output/support/WalkerTRIM$1;
.super Ljava/lang/Object;
.source "WalkerTRIM.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/WalkerTRIM;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$org$jdom2$Content$CType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 125
    invoke-static {}, Lorg/jdom2/Content$CType;->values()[Lorg/jdom2/Content$CType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/jdom2/output/support/WalkerTRIM$1;->$SwitchMap$org$jdom2$Content$CType:[I

    :try_start_0
    sget-object v0, Lorg/jdom2/output/support/WalkerTRIM$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lorg/jdom2/output/support/WalkerTRIM$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->CDATA:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lorg/jdom2/output/support/WalkerTRIM$1;->$SwitchMap$org$jdom2$Content$CType:[I

    sget-object v1, Lorg/jdom2/Content$CType;->EntityRef:Lorg/jdom2/Content$CType;

    invoke-virtual {v1}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
