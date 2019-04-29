.class public Lcom/rt/mobile/english/wear/GetNewsTask;
.super Ljava/lang/Object;
.source "GetNewsTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;
    }
.end annotation


# instance fields
.field articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private callBack:Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/rt/mobile/english/wear/GetNewsTask;->callBack:Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    .line 38
    invoke-static {p2}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/wear/GetNewsTask;)Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/rt/mobile/english/wear/GetNewsTask;->callBack:Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    return-object p0
.end method


# virtual methods
.method public execute()V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/rt/mobile/english/wear/GetNewsTask;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    new-instance v1, Lcom/rt/mobile/english/wear/GetNewsTask$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/wear/GetNewsTask$1;-><init>(Lcom/rt/mobile/english/wear/GetNewsTask;)V

    invoke-interface {v0, v1}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getArticlesLatest(Lretrofit/Callback;)V

    return-void
.end method
