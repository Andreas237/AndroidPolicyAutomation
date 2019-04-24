.class Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$1;
.super Ljava/lang/Object;
.source "SpotlightActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$SpotlightLocateStoreListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->setupLocateStore(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocateStoreMapClicked(Ljava/lang/Integer;)V
    .locals 1

    .line 385
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Ljava/lang/Integer;)V

    return-void
.end method
