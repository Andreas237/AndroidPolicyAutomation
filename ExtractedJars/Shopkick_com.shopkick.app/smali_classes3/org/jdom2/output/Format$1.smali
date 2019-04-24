.class final Lorg/jdom2/output/Format$1;
.super Ljava/lang/Object;
.source "Format.java"

# interfaces
.implements Lorg/jdom2/output/EscapeStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/Format;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldEscape(C)Z
    .locals 0

    .line 150
    invoke-static {p1}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
