.class public final Lio/github/wax911/library/model/request/QueryContainerBuilder;
.super Ljava/lang/Object;
.source "QueryContainerBuilder.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/wax911/library/model/request/QueryContainerBuilder$Creator;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0010\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0008\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
        "Landroid/os/Parcelable;",
        "queryContainer",
        "Lio/github/wax911/library/model/request/QueryContainer;",
        "(Lio/github/wax911/library/model/request/QueryContainer;)V",
        "build",
        "contrainsKey",
        "",
        "key",
        "",
        "describeContents",
        "",
        "getVariable",
        "",
        "putVariable",
        "value",
        "setQuery",
        "query",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation build Lkotlinx/android/parcel/Parcelize;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private final queryContainer:Lio/github/wax911/library/model/request/QueryContainer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/wax911/library/model/request/QueryContainerBuilder$Creator;

    invoke-direct {v0}, Lio/github/wax911/library/model/request/QueryContainerBuilder$Creator;-><init>()V

    sput-object v0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/github/wax911/library/model/request/QueryContainerBuilder;-><init>(Lio/github/wax911/library/model/request/QueryContainer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/github/wax911/library/model/request/QueryContainer;)V
    .locals 1
    .param p1    # Lio/github/wax911/library/model/request/QueryContainer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "queryContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->queryContainer:Lio/github/wax911/library/model/request/QueryContainer;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/wax911/library/model/request/QueryContainer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 11
    new-instance p1, Lio/github/wax911/library/model/request/QueryContainer;

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-direct {p1, p3, p3, p2, p3}, Lio/github/wax911/library/model/request/QueryContainer;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;-><init>(Lio/github/wax911/library/model/request/QueryContainer;)V

    return-void
.end method


# virtual methods
.method public final build()Lio/github/wax911/library/model/request/QueryContainer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->queryContainer:Lio/github/wax911/library/model/request/QueryContainer;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final putVariable(Ljava/lang/String;Ljava/lang/Object;)Lio/github/wax911/library/model/request/QueryContainerBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->queryContainer:Lio/github/wax911/library/model/request/QueryContainer;

    invoke-virtual {v0, p1, p2}, Lio/github/wax911/library/model/request/QueryContainer;->putVariable$library_release(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final setQuery(Ljava/lang/String;)Lio/github/wax911/library/model/request/QueryContainerBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    iget-object v0, p0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->queryContainer:Lio/github/wax911/library/model/request/QueryContainer;

    invoke-virtual {v0, p1}, Lio/github/wax911/library/model/request/QueryContainer;->setQuery(Ljava/lang/String;)V

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "parcel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/github/wax911/library/model/request/QueryContainerBuilder;->queryContainer:Lio/github/wax911/library/model/request/QueryContainer;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
