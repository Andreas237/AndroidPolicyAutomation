.class public final synthetic Lcom/ibotta/android/mvp/ui/view/notifications/-$$Lambda$NotificationRowView$V4-IBr9QKncVr7_UOx62u9blAtI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/-$$Lambda$NotificationRowView$V4-IBr9QKncVr7_UOx62u9blAtI;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/-$$Lambda$NotificationRowView$V4-IBr9QKncVr7_UOx62u9blAtI;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->lambda$getCreditPendingDate$0(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;Ljava/util/Map;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
