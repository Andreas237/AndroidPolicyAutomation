.class Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;
.super Landroid/os/AsyncTask;
.source "SKLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SaveLogsToDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/SKLogger;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/SKLogger$1;)V
    .locals 0

    .line 349
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;-><init>(Lcom/shopkick/app/application/SKLogger;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    .line 352
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->this$0:Lcom/shopkick/app/application/SKLogger;

    invoke-static {p1}, Lcom/shopkick/app/application/SKLogger;->access$300(Lcom/shopkick/app/application/SKLogger;)V

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->this$0:Lcom/shopkick/app/application/SKLogger;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/application/SKLogger;->access$402(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;)Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;

    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 349
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger$SaveLogsToDiskTask;->doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
