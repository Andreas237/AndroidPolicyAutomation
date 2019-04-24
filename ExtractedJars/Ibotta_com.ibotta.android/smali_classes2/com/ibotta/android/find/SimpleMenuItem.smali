.class public final Lcom/ibotta/android/find/SimpleMenuItem;
.super Ljava/lang/Object;
.source "FindRebatesReducer.kt"

# interfaces
.implements Lcom/ibotta/api/model/base/Actionable;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/find/SimpleMenuItem;",
        "Lcom/ibotta/api/model/base/Actionable;",
        "id",
        "",
        "label",
        "",
        "(ILjava/lang/String;)V",
        "link",
        "getId",
        "getLink",
        "getText",
        "setId",
        "",
        "setLink",
        "setText",
        "text",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private id:I

.field private label:Ljava/lang/String;

.field private link:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/find/SimpleMenuItem;->id:I

    iput-object p2, p0, Lcom/ibotta/android/find/SimpleMenuItem;->label:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/find/SimpleMenuItem;->id:I

    return v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/find/SimpleMenuItem;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/find/SimpleMenuItem;->label:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/find/SimpleMenuItem;->id:I

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/find/SimpleMenuItem;->link:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/find/SimpleMenuItem;->label:Ljava/lang/String;

    return-void
.end method
