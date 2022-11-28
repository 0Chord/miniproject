let my_chart = (context,obj,size) => {
    new Chart(context, {
        type: 'bar',
        data: {
            labels: [
                '1', '2', '3', '4', '5', '6', '7', '8', '9'
            ],
            datasets: [
                {
                    label: size,
                    fill: false,
                    data: obj[size],
                    backgroundColor: [
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)',
                        'rgba(255,99,132,0.2)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)',
                        'rgba(255,99,132,1)'
                    ],
                    borderWidth: 1
                }
            ]
        },
        options: {
            scales: {
                yAxes: [
                    {
                        ticks: {
                            beginAtZero: true
                        }
                    }
                ]
            }
        }
    })
}