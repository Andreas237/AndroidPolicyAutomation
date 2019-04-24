.class public final synthetic Lcom/shopkick/app/surveys/-$$Lambda$jaXXiuk1sNkE_KdupLoxcbJ7mUg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/surveys/PreSurveyScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/surveys/PreSurveyScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/surveys/-$$Lambda$jaXXiuk1sNkE_KdupLoxcbJ7mUg;->f$0:Lcom/shopkick/app/surveys/PreSurveyScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/surveys/-$$Lambda$jaXXiuk1sNkE_KdupLoxcbJ7mUg;->f$0:Lcom/shopkick/app/surveys/PreSurveyScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    return-void
.end method
