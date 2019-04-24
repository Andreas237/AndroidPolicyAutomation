.class public Lfi/firstbeat/ete/FBTvars;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public AC:I

.field public age:I

.field public gender:I

.field public height:I

.field public maxHr:I

.field public maxMET:I

.field public minHr:I

.field public monthlyLoad:I

.field public resourceRecovery:I

.field public weight:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 33
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 38
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 42
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 46
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 50
    return-void
.end method
