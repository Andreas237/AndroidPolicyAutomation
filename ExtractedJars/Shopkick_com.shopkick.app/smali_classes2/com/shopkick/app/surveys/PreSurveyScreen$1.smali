.class Lcom/shopkick/app/surveys/PreSurveyScreen$1;
.super Ljava/util/HashMap;
.source "PreSurveyScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/surveys/PreSurveyScreen;->showLegalWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/surveys/PreSurveyScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/surveys/PreSurveyScreen;)V
    .locals 1

    .line 192
    iput-object p1, p0, Lcom/shopkick/app/surveys/PreSurveyScreen$1;->this$0:Lcom/shopkick/app/surveys/PreSurveyScreen;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo p1, "url"

    const-string v0, "https://luc.id/privacy-policy/"

    .line 194
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/surveys/PreSurveyScreen$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
