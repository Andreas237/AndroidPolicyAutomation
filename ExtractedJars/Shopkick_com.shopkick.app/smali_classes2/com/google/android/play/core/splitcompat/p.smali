.class final Lcom/google/android/play/core/splitcompat/p;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/splitcompat/p;->a:Ljava/io/File;

    iput-object p2, p0, Lcom/google/android/play/core/splitcompat/p;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/p;->b:Ljava/lang/String;

    return-object v0
.end method

.method final b()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/p;->a:Ljava/io/File;

    return-object v0
.end method
