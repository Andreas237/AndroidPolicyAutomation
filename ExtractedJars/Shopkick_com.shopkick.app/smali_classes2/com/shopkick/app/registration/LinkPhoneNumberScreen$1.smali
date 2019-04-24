.class Lcom/shopkick/app/registration/LinkPhoneNumberScreen$1;
.super Ljava/lang/Object;
.source "LinkPhoneNumberScreen.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/registration/LinkPhoneNumberScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$1;->this$0:Lcom/shopkick/app/registration/LinkPhoneNumberScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$1;->this$0:Lcom/shopkick/app/registration/LinkPhoneNumberScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->access$000(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
