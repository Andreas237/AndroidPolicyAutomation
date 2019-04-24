.class Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eha;

.field final synthetic e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Lo/eha;)V
    .locals 0

    .line 874
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->b:Lo/eha;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 892
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 878
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->b:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/16 v1, 0x18

    if-ge v1, v0, :cond_0

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->b:Lo/eha;

    invoke-virtual {v1}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b:Ljava/lang/String;

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->b:Lo/eha;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iget-object v2, v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->b:Lo/eha;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;->e:Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/eha;->setSelection(I)V

    .line 887
    :cond_0
    return-void
.end method
