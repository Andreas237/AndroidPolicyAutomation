.class public Lo/fmd$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/foq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 253
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 263
    if-nez p1, :cond_0

    .line 264
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "no CoAP exchange!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :cond_0
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    if-nez v0, :cond_1

    .line 267
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "no CoAP request!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_1
    if-nez p2, :cond_2

    .line 270
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "no CoAP response!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 272
    :cond_2
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/fma;->b(Lo/fly;)V

    .line 273
    return-void
.end method

.method public d(Lo/fmb;)V
    .locals 2

    .line 257
    invoke-static {}, Lo/fmd;->a()Lo/fty;

    move-result-object v0

    const-string v1, "Default endpoint without CoapServer has received a request."

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p1}, Lo/fmb;->e()V

    .line 259
    return-void
.end method
