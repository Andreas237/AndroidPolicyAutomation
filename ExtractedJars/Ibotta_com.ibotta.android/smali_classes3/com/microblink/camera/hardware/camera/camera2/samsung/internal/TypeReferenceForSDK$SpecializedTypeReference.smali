.class Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK$SpecializedTypeReference;
.super Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SpecializedTypeReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK<",
        "TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;-><init>(Ljava/lang/reflect/Type;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK$1;)V

    return-void
.end method
