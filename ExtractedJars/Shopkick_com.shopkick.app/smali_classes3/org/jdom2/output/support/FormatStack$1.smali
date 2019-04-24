.class synthetic Lorg/jdom2/output/support/FormatStack$1;
.super Ljava/lang/Object;
.source "FormatStack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/FormatStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$org$jdom2$output$Format$TextMode:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 393
    invoke-static {}, Lorg/jdom2/output/Format$TextMode;->values()[Lorg/jdom2/output/Format$TextMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/jdom2/output/support/FormatStack$1;->$SwitchMap$org$jdom2$output$Format$TextMode:[I

    :try_start_0
    sget-object v0, Lorg/jdom2/output/support/FormatStack$1;->$SwitchMap$org$jdom2$output$Format$TextMode:[I

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v1}, Lorg/jdom2/output/Format$TextMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
