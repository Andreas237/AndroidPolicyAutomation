.class public final synthetic Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

.field private final synthetic f$1:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;->f$0:Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iput-object p2, p0, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;->f$1:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;->f$0:Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;->f$1:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->lambda$setNegativeOnClick$3(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Landroid/view/View;)V

    return-void
.end method
