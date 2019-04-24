.class Lcom/shopkick/app/application/SKDiskLogger$TableState;
.super Ljava/lang/Object;
.source "SKDiskLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKDiskLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TableState"
.end annotation


# instance fields
.field final inMemoryLogs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final logUrl:Ljava/lang/String;

.field persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

.field shouldUpload:Z

.field final tableName:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/application/SKDiskLogger;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKDiskLogger;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 304
    iput-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    .line 309
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    const/4 p1, 0x0

    .line 311
    iput-boolean p1, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->shouldUpload:Z

    .line 317
    iput-object p2, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->tableName:Ljava/lang/String;

    .line 318
    iput-object p3, p0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->logUrl:Ljava/lang/String;

    return-void
.end method
