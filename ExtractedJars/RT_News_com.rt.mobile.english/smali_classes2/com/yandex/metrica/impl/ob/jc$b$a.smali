.class public final Lcom/yandex/metrica/impl/ob/jc$b$a;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static volatile f:[Lcom/yandex/metrica/impl/ob/jc$b$a;


# instance fields
.field public b:J

.field public c:J

.field public d:[Lcom/yandex/metrica/impl/ob/jc$a;

.field public e:[Lcom/yandex/metrica/impl/ob/jc$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2866
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 2867
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$b$a;->e()Lcom/yandex/metrica/impl/ob/jc$b$a;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$b$a;
    .locals 2

    .line 2843
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->f:[Lcom/yandex/metrica/impl/ob/jc$b$a;

    if-nez v0, :cond_1

    .line 2844
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2846
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$b$a;->f:[Lcom/yandex/metrica/impl/ob/jc$b$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2847
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$b$a;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$b$a;->f:[Lcom/yandex/metrica/impl/ob/jc$b$a;

    .line 2849
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 2851
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$b$a;->f:[Lcom/yandex/metrica/impl/ob/jc$b$a;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2837
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$b$a;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$b$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2882
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 2883
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->c:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 2884
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 2885
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 2886
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x3

    .line 2888
    invoke-virtual {p1, v3, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2892
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v0, v0

    if-lez v0, :cond_3

    .line 2893
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 2894
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    const/4 v2, 0x4

    .line 2896
    invoke-virtual {p1, v2, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2900
    :cond_3
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$b$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2936
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_b

    const/16 v1, 0x8

    if-eq v0, v1, :cond_a

    const/16 v1, 0x10

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x22

    if-eq v0, v1, :cond_1

    .line 2941
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 2976
    :cond_1
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 2977
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    .line 2978
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$d;

    if-eqz v1, :cond_3

    .line 2981
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2983
    :cond_3
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_4

    .line 2984
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$d;-><init>()V

    aput-object v2, v0, v1

    .line 2985
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 2986
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 2989
    :cond_4
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$d;-><init>()V

    aput-object v2, v0, v1

    .line 2990
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 2991
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    goto :goto_0

    .line 2956
    :cond_5
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 2957
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v1, v1

    :goto_3
    add-int/2addr v0, v1

    .line 2958
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$a;

    if-eqz v1, :cond_7

    .line 2961
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2963
    :cond_7
    :goto_4
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_8

    .line 2964
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$a;-><init>()V

    aput-object v2, v0, v1

    .line 2965
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 2966
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 2969
    :cond_8
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$a;-><init>()V

    aput-object v2, v0, v1

    .line 2970
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 2971
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    goto/16 :goto_0

    .line 2951
    :cond_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->c:J

    goto/16 :goto_0

    .line 2947
    :cond_a
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->b:J

    goto/16 :goto_0

    :cond_b
    return-object p0
.end method

.method protected c()I
    .locals 5

    .line 2905
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 2906
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->b:J

    const/4 v3, 0x1

    .line 2907
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 2908
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->c:J

    const/4 v3, 0x2

    .line 2909
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 2910
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v0

    move v0, v2

    .line 2911
    :goto_0
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 2912
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    const/4 v4, 0x3

    .line 2915
    invoke-static {v4, v3}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v3

    add-int/2addr v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 2919
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    if-lez v1, :cond_4

    .line 2920
    :goto_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    if-ge v2, v1, :cond_4

    .line 2921
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    aget-object v1, v1, v2

    if-eqz v1, :cond_3

    const/4 v3, 0x4

    .line 2924
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$b$a;
    .locals 2

    const-wide/16 v0, 0x0

    .line 2871
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->b:J

    .line 2872
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->c:J

    .line 2873
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jc$a;->d()[Lcom/yandex/metrica/impl/ob/jc$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->d:[Lcom/yandex/metrica/impl/ob/jc$a;

    .line 2874
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jc$d;->d()[Lcom/yandex/metrica/impl/ob/jc$d;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->e:[Lcom/yandex/metrica/impl/ob/jc$d;

    const/4 v0, -0x1

    .line 2875
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$a;->a:I

    return-object p0
.end method
