.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;->f$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;

    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;->f$0:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;->f$1:Z

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->lambda$onUpdateProfileSuccess$0(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;Z)V

    return-void
.end method
