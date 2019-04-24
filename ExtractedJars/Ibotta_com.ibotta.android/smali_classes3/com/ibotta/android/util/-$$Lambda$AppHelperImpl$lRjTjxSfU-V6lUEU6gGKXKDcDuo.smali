.class public final synthetic Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/util/AppHelperImpl;

.field private final synthetic f$1:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/util/AppHelperImpl;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;->f$0:Lcom/ibotta/android/util/AppHelperImpl;

    iput-object p2, p0, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;->f$1:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;->f$0:Lcom/ibotta/android/util/AppHelperImpl;

    iget-object v1, p0, Lcom/ibotta/android/util/-$$Lambda$AppHelperImpl$lRjTjxSfU-V6lUEU6gGKXKDcDuo;->f$1:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/ibotta/android/util/AppHelperImpl;->lambda$showSoftKeyboardAsyncFocus$0(Lcom/ibotta/android/util/AppHelperImpl;Landroid/view/View;)V

    return-void
.end method
