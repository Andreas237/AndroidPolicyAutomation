.class final Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;
.super Ljava/lang/Object;
.source "Format.java"

# interfaces
.implements Lorg/jdom2/output/EscapeStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/Format;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DefaultCharsetEscapeStrategy"
.end annotation


# instance fields
.field private final encoder:Ljava/nio/charset/CharsetEncoder;


# direct methods
.method public constructor <init>(Ljava/nio/charset/CharsetEncoder;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p1, p0, Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;->encoder:Ljava/nio/charset/CharsetEncoder;

    return-void
.end method


# virtual methods
.method public shouldEscape(C)Z
    .locals 2

    .line 172
    invoke-static {p1}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 176
    :cond_0
    iget-object v0, p0, Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;->encoder:Ljava/nio/charset/CharsetEncoder;

    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method
