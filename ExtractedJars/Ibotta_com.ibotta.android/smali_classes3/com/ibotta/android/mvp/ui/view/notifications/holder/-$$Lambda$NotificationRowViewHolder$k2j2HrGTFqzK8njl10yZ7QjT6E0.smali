.class public final synthetic Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;

.field private final synthetic f$1:Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;->f$1:Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;->f$1:Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->lambda$bind$0(Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Landroid/view/View;)V

    return-void
.end method
