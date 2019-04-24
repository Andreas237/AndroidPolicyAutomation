.class Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CheckedChangeListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$100(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/CheckBox;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 159
    if-eqz p2, :cond_0

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$200(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/Button;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$drawable;->btn_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$302(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;Z)Z

    goto :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$200(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/Button;

    move-result-object v0

    sget v1, Lcom/huawei/ui/openservice/R$drawable;->btn_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$CheckedChangeListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$302(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;Z)Z

    .line 167
    :cond_1
    :goto_0
    return-void
.end method
