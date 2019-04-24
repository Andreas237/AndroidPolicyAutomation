.class public final Lcom/ibotta/android/views/ViewsModule;
.super Ljava/lang/Object;
.source "ViewsModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010$\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0008@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR&\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0018@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 @BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lcom/ibotta/android/views/ViewsModule;",
        "",
        "()V",
        "<set-?>",
        "Lcom/ibotta/android/util/AppHelper;",
        "appHelper",
        "getAppHelper",
        "()Lcom/ibotta/android/util/AppHelper;",
        "Lcom/ibotta/android/hardware/Hardware;",
        "hardware",
        "getHardware",
        "()Lcom/ibotta/android/hardware/Hardware;",
        "ibottaListViewHolderFactoryFactory",
        "Lkotlin/Function1;",
        "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
        "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
        "getIbottaListViewHolderFactoryFactory",
        "()Lkotlin/jvm/functions/Function1;",
        "setIbottaListViewHolderFactoryFactory",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;",
        "ibottaListViewTrackingHelper",
        "getIbottaListViewTrackingHelper",
        "()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;",
        "Lcom/ibotta/android/images/ImageCache;",
        "imageCache",
        "getImageCache",
        "()Lcom/ibotta/android/images/ImageCache;",
        "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
        "trackingQueue",
        "getTrackingQueue",
        "()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
        "Lcom/ibotta/android/util/Validation;",
        "validation",
        "getValidation",
        "()Lcom/ibotta/android/util/Validation;",
        "init",
        "",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/views/ViewsModule;

.field private static appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static ibottaListViewHolderFactoryFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
            "+",
            "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static ibottaListViewTrackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static validation:Lcom/ibotta/android/util/Validation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/ibotta/android/views/ViewsModule;

    invoke-direct {v0}, Lcom/ibotta/android/views/ViewsModule;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAppHelper()Lcom/ibotta/android/util/AppHelper;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->appHelper:Lcom/ibotta/android/util/AppHelper;

    if-nez v0, :cond_0

    const-string v1, "appHelper"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getHardware()Lcom/ibotta/android/hardware/Hardware;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->hardware:Lcom/ibotta/android/hardware/Hardware;

    if-nez v0, :cond_0

    const-string v1, "hardware"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getIbottaListViewHolderFactoryFactory()Lkotlin/jvm/functions/Function1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
            "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->ibottaListViewHolderFactoryFactory:Lkotlin/jvm/functions/Function1;

    if-nez v0, :cond_0

    const-string v1, "ibottaListViewHolderFactoryFactory"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getIbottaListViewTrackingHelper()Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->ibottaListViewTrackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    if-nez v0, :cond_0

    const-string v1, "ibottaListViewTrackingHelper"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getImageCache()Lcom/ibotta/android/images/ImageCache;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->imageCache:Lcom/ibotta/android/images/ImageCache;

    if-nez v0, :cond_0

    const-string v1, "imageCache"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getTrackingQueue()Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    if-nez v0, :cond_0

    const-string v1, "trackingQueue"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getValidation()Lcom/ibotta/android/util/Validation;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->validation:Lcom/ibotta/android/util/Validation;

    if-nez v0, :cond_0

    const-string v1, "validation"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final init(Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/images/ImageCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/hardware/Hardware;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/util/AppHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/util/Validation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/images/ImageCache;",
            "Lcom/ibotta/android/hardware/Hardware;",
            "Lcom/ibotta/android/util/AppHelper;",
            "Lcom/ibotta/android/util/Validation;",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
            "+",
            "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "imageCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardware"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingQueue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaListViewTrackingHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ibottaListViewHolderFactoryFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sput-object p1, Lcom/ibotta/android/views/ViewsModule;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 39
    sput-object p2, Lcom/ibotta/android/views/ViewsModule;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 40
    sput-object p3, Lcom/ibotta/android/views/ViewsModule;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 41
    sput-object p4, Lcom/ibotta/android/views/ViewsModule;->validation:Lcom/ibotta/android/util/Validation;

    .line 42
    sput-object p5, Lcom/ibotta/android/views/ViewsModule;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    .line 43
    sput-object p6, Lcom/ibotta/android/views/ViewsModule;->ibottaListViewTrackingHelper:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTrackingHelper;

    .line 44
    sput-object p7, Lcom/ibotta/android/views/ViewsModule;->ibottaListViewHolderFactoryFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setIbottaListViewHolderFactoryFactory(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;",
            "+",
            "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sput-object p1, Lcom/ibotta/android/views/ViewsModule;->ibottaListViewHolderFactoryFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method
