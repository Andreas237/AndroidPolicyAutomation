.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

.field private final synthetic f$1:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;->f$1:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;->f$0:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/-$$Lambda$ImTermsActivity$D12eaod85xplpIJHHXvbYbjY_mk;->f$1:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;->lambda$bindViewEvents$1(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsActivity;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;Landroid/view/View;)V

    return-void
.end method
