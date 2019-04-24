.class public final synthetic Lcom/ibotta/android/tracking/scrolltracking/-$$Lambda$xn6tdJSASZLuNCYqg3YSjXL-9f8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/-$$Lambda$xn6tdJSASZLuNCYqg3YSjXL-9f8;->f$0:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/-$$Lambda$xn6tdJSASZLuNCYqg3YSjXL-9f8;->f$0:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->track()V

    return-void
.end method
