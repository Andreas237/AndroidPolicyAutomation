.class final Lorg/jdom2/output/Format$EscapeStrategy8Bits;
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
    name = "EscapeStrategy8Bits"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/output/Format$1;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lorg/jdom2/output/Format$EscapeStrategy8Bits;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldEscape(C)Z
    .locals 0

    ushr-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
