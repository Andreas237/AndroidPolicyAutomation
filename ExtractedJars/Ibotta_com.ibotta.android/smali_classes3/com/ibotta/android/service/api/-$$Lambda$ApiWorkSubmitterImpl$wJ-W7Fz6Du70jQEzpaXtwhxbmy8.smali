.class public final synthetic Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$wJ-W7Fz6Du70jQEzpaXtwhxbmy8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$wJ-W7Fz6Du70jQEzpaXtwhxbmy8;->f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/service/api/-$$Lambda$ApiWorkSubmitterImpl$wJ-W7Fz6Du70jQEzpaXtwhxbmy8;->f$0:Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;

    invoke-static {v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;->lambda$start$1(Lcom/ibotta/android/service/api/ApiWorkSubmitterImpl;)V

    return-void
.end method
