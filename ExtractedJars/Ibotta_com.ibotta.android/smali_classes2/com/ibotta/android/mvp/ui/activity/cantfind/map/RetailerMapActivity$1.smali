.class Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity$1;
.super Ljava/lang/Object;
.source "RetailerMapActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->showGooglePlayNotAvailable(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 161
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/map/RetailerMapActivity;->finish()V

    return-void
.end method
