.class final Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;
.super Ljava/lang/Object;
.source "AlertMessageContent.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "onClick"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $viewEvents:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

.field final synthetic this$0:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    iput-object p2, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;->$viewEvents:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/messages/alert/AlertMessageContent;

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getAlertMessage()Lcom/ibotta/android/views/messages/alert/AlertMessage;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessage;->dismiss()V

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;->$viewEvents:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    invoke-interface {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;->onDismissTapped()V

    return-void
.end method
