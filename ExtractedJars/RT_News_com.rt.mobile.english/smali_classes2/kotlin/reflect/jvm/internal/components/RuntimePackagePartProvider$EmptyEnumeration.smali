.class final Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;
.super Ljava/lang/Object;
.source "RuntimePackagePartProvider.kt"

# interfaces
.implements Ljava/util/Enumeration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EmptyEnumeration"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c2\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;",
        "Ljava/util/Enumeration;",
        "",
        "()V",
        "hasMoreElements",
        "",
        "nextElement",
        "descriptors.runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 78
    new-instance v0, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;->INSTANCE:Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasMoreElements()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic nextElement()Ljava/lang/Object;
    .locals 1

    .line 78
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;->nextElement()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public nextElement()Ljava/lang/Void;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 80
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method
