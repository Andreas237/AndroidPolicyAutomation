.class Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 147
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataType selected num is::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;

    add-int/lit8 v1, p3, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;I)I

    .line 149
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;)V"
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;I)I

    .line 154
    return-void
.end method
