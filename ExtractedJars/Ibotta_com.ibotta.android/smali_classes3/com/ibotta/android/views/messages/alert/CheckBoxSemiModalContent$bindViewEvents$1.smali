.class final Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$1;
.super Ljava/lang/Object;
.source "CheckBoxSemiModalContent.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
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
.field final synthetic this$0:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 36
    iget-object p1, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$1;->this$0:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->onPrimaryClicked()V

    return-void
.end method
