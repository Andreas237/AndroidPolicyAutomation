.class public final synthetic Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

.field private final synthetic f$1:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;Ljava/util/Collection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;->f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

    iput-object p2, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;->f$1:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;->f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

    iget-object v1, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$WwOCX6wrSoRaxYSB4HYViqCSmE8;->f$1:Ljava/util/Collection;

    invoke-static {v0, v1}, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->lambda$submit$0(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;Ljava/util/Collection;)V

    return-void
.end method
