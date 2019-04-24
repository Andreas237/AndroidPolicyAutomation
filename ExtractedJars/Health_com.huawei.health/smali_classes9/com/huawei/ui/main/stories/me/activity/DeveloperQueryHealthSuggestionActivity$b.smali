.class Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V
    .locals 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;->e:Ljava/lang/ref/WeakReference;

    .line 164
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;

    .line 169
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 170
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryHealthSuggestionActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-void

    .line 174
    :cond_0
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;Z)Z

    .line 175
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    goto :goto_0

    .line 176
    :catch_0
    move-exception v5

    .line 177
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :goto_0
    return-void
.end method
