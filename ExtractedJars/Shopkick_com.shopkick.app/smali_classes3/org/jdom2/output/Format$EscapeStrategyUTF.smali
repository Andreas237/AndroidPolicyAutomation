.class final Lorg/jdom2/output/Format$EscapeStrategyUTF;
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
    name = "EscapeStrategyUTF"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/output/Format$1;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lorg/jdom2/output/Format$EscapeStrategyUTF;-><init>()V

    return-void
.end method


# virtual methods
.method public final shouldEscape(C)Z
    .locals 0

    .line 102
    invoke-static {p1}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result p1

    return p1
.end method
