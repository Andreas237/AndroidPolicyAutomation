.class public final Lio/fotoapparat/configuration/UpdateConfiguration$Companion;
.super Ljava/lang/Object;
.source "UpdateConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/configuration/UpdateConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"
    }
    d2 = {
        "Lio/fotoapparat/configuration/UpdateConfiguration$Companion;",
        "",
        "()V",
        "builder",
        "Lio/fotoapparat/configuration/UpdateConfiguration$Builder;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Lio/fotoapparat/configuration/UpdateConfiguration$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final builder()Lio/fotoapparat/configuration/UpdateConfiguration$Builder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 101
    new-instance v0, Lio/fotoapparat/configuration/UpdateConfiguration$Builder;

    invoke-direct {v0}, Lio/fotoapparat/configuration/UpdateConfiguration$Builder;-><init>()V

    return-object v0
.end method
